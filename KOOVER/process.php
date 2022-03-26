<?php
$con=mysqli_connect("localhost", "root", "", "db_koover");
//check connection

if (mysqli_connect_errno())
{
	echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

//get parameter

$nohp= $_POST['nohp'];
$password= $_POST['password'];

//jalankan query
$query = "SELECT nohp,password FROM users where nohp='$nohp' and password='$password'";
//echo $query;
$result = mysqli_query($con, $query);
$row=mysqli_fetch_array($result);
$data = $row[0];

if($data) {
	echo $data;
}
mysqli_close($con);
?>