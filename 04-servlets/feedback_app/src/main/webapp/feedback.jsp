<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">

<title>Bootstrap demo</title>
<%@ include file="components/links.jsp"%>
<%@ include file="components/scripts.jsp"%>
<%@ include file="components/header.jsp"%>
</head>
<body>
	<div
		class="content_container py-4 d-flex flex-column justify-content-center align-items-center">
		<h3 class="text-white">Fill the Feedback Form</h3>
		<form action="<%= application.getContextPath() %>/feedback" method="post" class="mt-3 text-white">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> 
					<input placeholder="Enter Email here" name="email" type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text text-white">We'll never share your
					email with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="examplePhoneNumber" class="form-label">Mobile Number</label>
				<input name="mobileno" placeholder="Enter your Mobile Number" type="number" class="form-control"
					id="examplePhoneNumber">
			</div>
			<div class="mb-3">
				<label for="examplePhoneNumber" class="form-label">Your Feedback Message</label>
				<textarea name="feedbackmsg" rows="10" placeholder="Your Feedback" class="form-control"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-warning">Submit</button>
				<button type="submit" class="btn btn-light">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>