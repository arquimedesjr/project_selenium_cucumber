package stepDefinition;

import br.com.auto.testBase.TestBase;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Google;

public class StepHome extends TestBase {

	private Google pageGoogle = new Google();

	@Dado("^que navego na url do google$")
	public void que_navego_na_url_do_google() throws Throwable {
		setUrl();
		takeScreenShotTest();
	}

	@Quando("^insiro no campo de perquisa 'Joe Russo'$")
	public void insiro_no_campo_de_perquisa_Joe_Russo() throws Throwable {
		sendkeysELement(pageGoogle.fieldSearchHome(), "Joe Russo");
		takeScreenShotTest();
	}

	@E("^clico no botao 'Pesquisa Google'$")
	public void clico_no_botao_Pesquisa_Google() throws Throwable {
		clickForELement(pageGoogle.buttonSearch());
		takeScreenShotTestAllPage(pageGoogle.containsNameJoeRusso());

	}

	@Entao("^capturo a data de nascimento do diretor 'Joe Russo'$")
	public void capturo_a_data_de_nascimento_do_diretor_Joe_Russo() throws Throwable {
		validationText(pageGoogle.textDateBirthJoe(), "3 de fevereiro de 1970 (idade 50 anos),");
		takeScreenShotTest();
	}

	@Entao("^valido a funcionalidade scroll action$")
	public void valido_a_funcionalidade_scrol_action() throws Throwable {
		scrolElementAction(pageGoogle.labelRodaPe());
		takeScreenShotTest();
	}

	@Entao("^valido a funcionalidade scroll js$")
	public void valido_a_funcionalidade_scrol_js() throws Throwable {
		scrolElementJS(pageGoogle.labelRodaPe());
		takeScreenShotTest();
	}

}
