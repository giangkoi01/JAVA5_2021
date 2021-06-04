<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--  <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%> --%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	  <title>Bootstrap Example</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	  
  <style type="text/css">
		.product-item {
			width: 30%;
		}
		
		.shop {
			display: flex;
		}
</style>
	
	  
	  
	  
	  
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <!-- Brand/logo -->
	  <a class="navbar-brand" href="${pageContext.request.contextPath}">Home</a>
	  
	  <!-- Links -->
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="${pageContext.request.contextPath}/product">Product</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
	    </li>	
	    <li class="nav-item">
	      <a class="nav-link" href="${pageContext.request.contextPath}/contact">Contact</a>
	    </li>
	  </ul>
	  
	  <form class="form-inline" action="${pageContext.request.contextPath}/product">
	    <input name="name" class="form-control mr-sm-2" type="text" placeholder="Search by name">
	    <button class="btn btn-success" type="submit">Search</button>
	  </form>
	  
	</nav>
	
	<div class="container">
		<div class="shop">
			<c:forEach var="product" items="${list}">
			    <div class="product-item row">
			        <div class="col-md-3 col-sm-6">
			            <div class="product-grid2">
			                <div class="product-image2">
			                    <a href="${pageContext.request.contextPath}/product/detail/${product.id}">
			                        <img class="pic-1" src="http://bestjquery.com/tutorial/product-grid/demo3/images/img-7.jpeg">
			                        <img class="pic-2" src="http://bestjquery.com/tutorial/product-grid/demo3/images/img-8.jpeg">
			                    </a>
			                    <ul class="social">
			                        <li><a href="#" data-tip="Quick View"><i class="fa fa-eye"></i></a></li>
			                        <li><a href="#" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
			                        <li><a href="#" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
			                    </ul>
			                    <a class="add-to-cart" href="${pageContext.request.contextPath}/add-card/${product.id}">Add to cart</a>
			                </div>
			                <div class="product-content">
			                    <h3 class="title"><a href="#">${product.name}</a></h3>
			                    <span class="price">${product.price}</span>
			                </div>
			            </div>
			        </div>
			    </div>
		    </c:forEach>
	    </div>
	</div>
	
	
</body>
</html>