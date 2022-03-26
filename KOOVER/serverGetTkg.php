<?php
$con=mysqli_connect("localhost", "root", "", "db_koover");
//check connection

if (mysqli_connect_errno())
{
	echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

//get parameter

$pekerjaan=$_GET['pekerjaan'];
$alamat=$_GET['alamat'];

//jalankan query
$query = "SELECT nohptkg, namatkg, alamat FROM tukang where pekerjaan='$pekerjaan' and alamat='$alamat'";
//echo $query;
$result = mysqli_query($con, $query);
$row=mysqli_fetch_array($result);
$data = $row[0];

if($data) {
	echo $row[0]."-".$row[1]."-".$row[2];
}
mysqli_close($con);
?>