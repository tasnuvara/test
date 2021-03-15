package StepDefination;

import PageObject.Product;
import PageObject.Search;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class SearchSteps {

		Product product;
		Search search;
	 
	@Given("I have search field on Google Page")
	public void i_have_search_field_on_amazon_page() {
	  System.out.println("Step 1: I am on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name :"+ productName +" price: "+ price);
		
		product =new Product(productName,price);
	}

	@Then("Product with {string} Should be displayed")
	public void product_with_should_be_displayed(String productName) {
		System.out.println("Step 3:  product :" + productName + " is displayed");
		search = new Search ();
		String name =search.displayProduct(product);
		System.out.println("searched product os : "+ name);
		Assert.assertEquals(product.getProductName(), name);
	}

}
