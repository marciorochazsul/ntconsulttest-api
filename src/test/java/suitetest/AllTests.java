package suitetest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcasesapi.CenariosExcecao;

@RunWith(Suite.class)
@SuiteClasses({

		CenariosExcecao.class,
		CenariosExcecao.class

})
public class AllTests {

}
