package executavel;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import Listener.ExecucaoListener;

public class RunSuiteTest extends BlockJUnit4ClassRunner {

    public RunSuiteTest(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override public void run(RunNotifier notifier){
        notifier.addListener(new ExecucaoListener());
        notifier.fireTestRunStarted(getDescription());
        super.run(notifier);
    }
}
