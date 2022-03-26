<?php
$con=mysqli_connect("localhost", "root", "", "my_db");
//check connection

if (mysqli_connect_errno())
{
	echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

//get parameter

$username=$_GET['username'];
$password=$_GET['password'];

//jalankan query
$query = "SELECT role FROM users where username='$username' and password='$password'";
//echo $query;
$result = mysqli_query($con, $query);
$row=mysqli_fetch_array($result);
$data = $row[0];

if($data) {
	echo $data;
}
mysqli_close($con);
?>