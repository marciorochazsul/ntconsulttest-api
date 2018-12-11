package runListener;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import listener.ConfigListener;

public class RunListenerTest extends BlockJUnit4ClassRunner {

    public RunListenerTest(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override public void run(RunNotifier notifier){
        notifier.addListener(new ConfigListener());
        notifier.fireTestRunStarted(getDescription());
        super.run(notifier);
    }
}
