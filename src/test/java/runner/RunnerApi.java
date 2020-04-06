//
//package runner;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//import io.restassured.RestAssured;
//import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;
//
//import org.apache.commons.io.IOUtils;
//import org.json.JSONObject;
//import org.junit.Test;
//
//import com.google.common.io.Files;
//
//public class RunnerApi {
//
//	private RequestSpecification httpRequest;
//
//	@Test public void Teste() { // String uriBase =
//  "http://localhost:5000/alunos"; // // ValidatableResponse text =
//  given().relaxedHTTPSValidation().when().get(uriBase).then().statusCode(200)
//  // .contentType(ContentType.JSON);
//  
//  // RestAssured.baseURI = "http://localhost:5000/alunos"; //
//  RequestSpecification httpRequest = RestAssured.given(); // // JSONObject
//  requestParams = new JSONObject(); // // requestParams.put("id", "4"); //
//  requestParams.put("nome", "Arquimedes"); // //
//  httpRequest.header("Content-Type", "application/json"); // //
//  System.out.println(requestParams.toString()); //
//  httpRequest.body(requestParams.toString()); // // Response response =
//  httpRequest.post(RestAssured.baseURI); // // // Retrieve the body of the
//  Response // ResponseBody body = response.getBody(); // // // To check for sub
//  string presence get the Response body as a String. // // Do a String.contains
//  // String bodyAsString = body.asString(); //
//  System.out.println(bodyAsString); // // // convert the body into lower case
//  and then do a comparison to ignore casing.
//  
//  setUpApi("http://localhost:5000/alunos");
//  
//  List<String> names = new ArrayList<String>(); List<String> values = new
//  ArrayList<String>();
//  
//  names.add("id"); names.add("nome");
//  
//  values.add("2"); values.add("Junior");
//  
//  apiPost(names, values); }
//
//	public void setUpApi(String url) {
//		RestAssured.baseURI = url;
//		httpRequest = RestAssured.given();
//	}
//
//	public void apiPost(List<String> parameterNames, List<String> parameterValues) { 
//		httpRequest.header("Content-Type", "application/json"); //
//
//  for (String parameterName : parameterNames) { 
//	  // for (String parameterValue :
//  }
//  parameterValues) { 
//	  // requestParams.put(parameterNames, parameterValues); //
//  // } // } 
//	  String jsonTxt = null; InputStream is; 
//	  try { is = new FileInputStream("src\\test\\java\\runner\\json.json"); 
//	  jsonTxt = IOUtils.toString(is, "UTF-8"); 
//	  System.out.println(jsonTxt);
//  
//  
//  } catch (FileNotFoundException e) { // TODO Auto-generated catch block
//  e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
//  block e.printStackTrace(); }
//  
//  // requestParams. //
//  
//  httpRequest.body(jsonTxt); Response response =
//  httpRequest.post(RestAssured.baseURI);
//  
//  // Retrieve the body of the Response ResponseBody body = response.getBody();
//  
//  // To check for sub string presence get the Response body as a String. // Do
//  a String.contains String bodyAsString = body.asString();
//  System.out.println(bodyAsString);
//  
//  }
//  
//  }
