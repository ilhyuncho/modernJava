package ExecutorExam;

import java.util.concurrent.Executor;

public class ExecutorExample implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
