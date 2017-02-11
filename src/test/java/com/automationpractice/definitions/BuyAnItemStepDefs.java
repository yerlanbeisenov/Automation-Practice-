package com.automationpractice.definitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import com.automationpractice.pages.AddressesPage;
import com.automationpractice.pages.ConfirmationPage;
import com.automationpractice.pages.PaymentMethodPage;
import com.automationpractice.pages.ShippingPage;
import com.automationpractice.pages.ShoppingCartPage;
import com.automationpractice.utilities.Base;

import cucumber.api.java.en.Then;

public class BuyAnItemStepDefs extends Base{
	ShoppingCartPage shopCart = new ShoppingCartPage();
	AddressesPage address = new AddressesPage();
	ShippingPage shipping = new ShippingPage();
	PaymentMethodPage payment = new PaymentMethodPage();
	ConfirmationPage confirm = new ConfirmationPage();
	//this is a comment 
	@Then("^I should be able to change a qty of the item, delete the item, and see a price$")
	public void i_should_be_able_to_change_a_qty_of_the_item_delete_the_item_and_see_a_price() throws Throwable {
		try{assertTrue("Decrease QTY button not Enabled", shopCart.decreaseQty.isEnabled());}
		catch(Exception e){fail("Decrease QTY button not found");}
		try{assertTrue("Increase QTY button not Enabled", shopCart.increaseQty.isEnabled());}
		catch(Exception e){fail("Increase QTY button not found");}
		try{assertTrue("Delete button not Enabled", shopCart.deleteAnItem.isEnabled());}
		catch(Exception e){fail("Delete button not found");}
		shopCart.checkoutButton.click();
	}
	
	@Then("^I should be able to see shipping and billing address$")
	public void i_should_be_able_to_see_shipping_and_billing_address() throws Throwable {
		try{assertTrue("Delivery Address Not Displayed", address.deliveryAddress.isDisplayed());}
		catch(Exception e){System.out.println("Delivery Address Not Found");}
		
		try{assertTrue("Billing Address Not Displayed", address.billingAddress.isDisplayed());}
		catch(Exception e){System.out.println("Billing Address Not Found");}
		address.checkoutButton.click();
	}

	@Then("^I should be able to see a price for shipping$")
	public void i_should_be_able_to_see_a_price_for_shipping() throws Throwable {
		System.out.println("Shipping Price: "+shipping.shippingPrice.getText());
		shipping.agreeToTerm.click();
		shipping.checkoutButton.click();
	}

	@Then("^I should be able to choose payment options and confirm my order$")
	public void i_should_be_able_to_choose_payment_options_and_confirm_my_order() throws Throwable {
		payment.bankWirePayment.click();
		payment.confimMyOrderButton.click();
	}

	@Then("^I should be able to see an confirmation page$")
	public void i_should_be_able_to_see_an_confirmation_page() throws Throwable {
		assertTrue("Order Confirmation text is NOT displayed", confirm.orderConfirmation.isDisplayed());
		System.out.println("Confirmation Info:\n"+confirm.confirmationText.getText());
	}
}
