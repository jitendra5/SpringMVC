<html>
<head>
</head>
<body>
	<h2>${msg}</h2>
	<h2>${maMsg}</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td>${ student1.studentName}</td>
		</tr>
		<tr>
			<td>Hobby:</td>
			<td>${ student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Number:</td>
			<td>${ student1.studentNumber}</td>
		</tr>
		<tr>
			<td>Date of birth:</td>
			<td>${ student1.dateOfBirth}</td>
		</tr>
		<tr>
			<td>Skills:</td>
			<td>${ student1.studentSkill}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>city:${student1.studentAddress.city}
				pin:${student1.studentAddress.pin}
				street:${student1.studentAddress.street}
				country:${student1.studentAddress.country}</td>
		</tr>
	</table>
</body>
</html>