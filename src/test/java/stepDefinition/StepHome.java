package stepDefinition;


import br.com.auto.file.FileMassaDadosProperties;
import br.com.auto.tool.utils.TestToolUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Google;

public class StepHome extends TestToolUtils {

	private Google pageGoogle = new Google();

	@Dado("^que navego na url do google$")
	public void que_navego_na_url_do_google() throws Throwable {
		testBasewWeb.setUpBrowser();
		testBasewWeb.setUrl(FileMassaDadosProperties.getInstance().searchKeyProperties("browser_url"));
		testBasewWeb.takeScreenShotTest();
	}


	@Quando("^insiro no campo de perquisa 'Joe Russo'$")
	public void insiro_no_campo_de_perquisa_Joe_Russo() throws Throwable {
		testBasewWeb.sendkeysELement(pageGoogle.fieldSearchHome(), "Joe Russo");
		testBasewWeb.takeScreenShotTest();
	}

	@E("^clico no botao 'Pesquisa Google'$")
	public void clico_no_botao_Pesquisa_Google() throws Throwable {
		testBasewWeb.clickForELement(pageGoogle.buttonSearch());
		testBasewWeb.takeScreenShotTestAllPage(pageGoogle.containsNameJoeRusso());

	}

	@Entao("^capturo a data de nascimento do diretor 'Joe Russo'$")
	public void capturo_a_data_de_nascimento_do_diretor_Joe_Russo() throws Throwable {
		testBasewWeb.validationText(pageGoogle.textDateBirthJoe(), "3 de fevereiro de 1970 (idade 50 anos),");
		testBasewWeb.takeScreenShotTest();
	}

	@Entao("^valido a funcionalidade scroll action$")
	public void valido_a_funcionalidade_scrol_action() throws Throwable {
		testBasewWeb.scrolElementAction(pageGoogle.labelRodaPe());
		testBasewWeb.takeScreenShotTest();
	}

	@Entao("^valido a funcionalidade scroll js$")
	public void valido_a_funcionalidade_scrol_js() throws Throwable {
		testBasewWeb.scrolElementJS(pageGoogle.labelRodaPe());
		testBasewWeb.takeScreenShotTest();
	}
}
