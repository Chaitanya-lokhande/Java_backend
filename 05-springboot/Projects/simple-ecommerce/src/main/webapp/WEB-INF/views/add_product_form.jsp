<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-4">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<h2 class="text-center">Add Product</h2>
			
			<form action="added-product" method="post">
				<div class="form-group">
				<label for="productName">Product Name</label>
				<input type="text" class="form-control" id="productName" aria-describedby="emailHelp"
				name="productName" placeholder="Enter Product Name here">
							
				</div>
				
				<div class="form-group">
				<label for="description">Product Description</label>
				<textarea class="form-control" id="description" name="description" 
				placeholder="Enter Product Description here" rows="5"></textarea>
				</div>
				
				<div class="form-group">
				<label for="price">Price</label>
				<input type="text" class="form-control" id="price" name="price"
				 placeholder="Enter Product Price here">
				</div>
				
				<div class="container text-center">
				<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
				<button type="submit" class="btn btn-success"]>Add</button>
				</div>
				
			</form>
		
		</div>
	
	</div>
</div>




</body>
</html>