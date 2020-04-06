package stepDefinition;

import org.junit.Assert;

import br.com.auto.file.FileMassaDadosProperties;
import br.com.auto.tool.utils.TestToolUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepApi extends TestToolUtils {

	@Dado("^que insiro a url para acessar api$")
	public void que_insiro_a_url_para_acessar_api() throws Throwable{
		testBasewApi.setUp(FileMassaDadosProperties.getInstance().searchKeyProperties("api_url"));
	}

	@Quando("^capturo o json para realizar um POST$")
	public void capturo_o_json_para_realizar_um_POST() throws Throwable{
		testBasewApi.post(FileMassaDadosProperties.getInstance().searchKeyProperties("api_dir_json"));
	}

	@Então("^retorna o request (\\d+)$")
	public void retorna_o_request(int arg1) throws Throwable {
		if (arg1 != testBasewApi.code) {
			Assert.assertFalse("A reposta da resquest não foi confome esperado, erro: " + testBasewApi.code, true);
		}
	}

	@Quando("^capturo o json 'json_invalido' para realizar um POST$")
	public void capturo_o_json_json_invalido_para_realizar_um_POST() throws Throwable {
		testBasewApi.post(FileMassaDadosProperties.getInstance().searchKeyProperties("api_dir_json_ivalido"));

	}

	@Quando("^capturo o json 'json_valido' para realizar um POST$")
	public void capturo_o_json_json_valido_para_realizar_um_POST() throws Throwable {
		testBasewApi.post(FileMassaDadosProperties.getInstance().searchKeyProperties("api_dir_json_valido"));
	}

	@Quando("^capturo o json 'json_valido(\\d+)' para realizar um POST$")
	public void capturo_o_json_json_valido_para_realizar_um_POST(int arg1) throws Throwable {
		testBasewApi.post(FileMassaDadosProperties.getInstance().searchKeyProperties("api_dir_json_valido_2"));
	}

	@Quando("^realizo uma consulta com o comando GET$")
	public void realizo_uma_consulta_com_o_comando_GET() {
		testBasewApi.get();
	}

	@Então("^valido o json o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void valido_o_json_o_campo_com_o_valor(String key, String value) throws Throwable {
		testBasewApi.validacion(key, value);
	}
	
	@Quando("^realizo um DELETE através da url$")
	public void realizo_um_DELETE_através_da_url() throws Throwable {
	    testBasewApi.delete();
	}

	@Então("^valido o retorno da request (\\d+)$")
	public void valido_o_retorno_da_request(int arg1) throws Throwable {
		if (arg1 != testBasewApi.code) {
			Assert.assertFalse("A reposta da resquest não foi confome esperado, erro: " + testBasewApi.code, true);
		}
	}

	@Dado("^que insiro a \"([^\"]*)\" para acessar api$")
	public void que_insiro_a_para_acessar_api(String arg1) throws Throwable {
		testBasewApi.setUp(FileMassaDadosProperties.getInstance().searchKeyProperties(arg1));
	    
	}


}
