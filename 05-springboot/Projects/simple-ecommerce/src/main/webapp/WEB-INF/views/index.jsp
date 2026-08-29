<html>
<head>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome to Product Manage App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${product }" var="p">
					
						<tr>
							<th scope="row">PROD-LKAU${p.pId }-DSJK</th>
							<td>${p.productName }</td>
							<td>${p.description }</td>
							<td class="font-weight-bold">&#8377; ${p.price }</td>
							<td>
							<a href="delete/${p.pId }"><i class="fa-solid fa-trash text-danger"></i></a>
							<a href="update/${p.pId }"><i class="fa-solid fa-pen-to-square"></i></a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				
				<div class="container text-center">
				<a href="addProduct" class="btn btn-outline-success">Add Product</a>
				</div>
			</div>

		</div>


	</div>


</body>
</html>
