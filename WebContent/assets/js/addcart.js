/**
 * This javascript will be used when add to cart button is clicked.
 */

function AddToCart(pid){
	var URL = "/CloudServices/rest/users/addcart/"+pid;
	alert("Going to URL : "+URL);
	window.location=URL;
}