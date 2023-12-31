package ForkJoin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class ForkJoinDirSize extends RecursiveTask<Long> {
    private final Path path;

    public ForkJoinDirSize(Path path){
        this.path = path;
    }
    @Override
    protected Long compute() {
        long fileSize = 0;

        // 디렉터리일 경우 하위 작업으로 분리한다.
        if(Files.isDirectory(path)){
            try{
                List<Path> fileList = Files.list(path).collect(Collectors.toList());
                List<ForkJoinDirSize> subTaskList = new ArrayList<>();

                // 하위 작업을 생성하고 포크시킨다(백그라운드로 실행시킨다)
                for(Path file : fileList){
                    ForkJoinDirSize subTask = new ForkJoinDirSize(file);
                    subTask.fork();

                    // 작업 목록을 관리하기 위해 List객체에 추가
                    subTaskList.add(subTask);
                }

                Long subSize = 0L;

                // 하위 작업들이 종료될 때까지 대기한다.
                for(ForkJoinDirSize subTask : subTaskList){
                    subSize += subTask.join();
                }
                return subSize;
            }
            catch (IOException e){
                System.out.println("error: " + path);
            }
        }
        // 파일일 경우 크기 리턴
        else{
            try{
                fileSize = Files.size(path);
            }
            catch (IOException e){
                System.out.println("Error :" + path );
            }
        }
        return fileSize;
    }
}
