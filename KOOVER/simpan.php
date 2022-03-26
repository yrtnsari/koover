<?php
	
	$con = mysqli_connect("localhost","root","","db_koover");
	
	if(mysqli_connect_errno())
	{
		echo "Failed to connect to MySQL: ". mysqli_connect_error();
	}

	$nohp = $_GET['nohp'];
	$password = $_GET['password'];
	$nama = $_GET['nama'];
	
	$query = "INSERT INTO users VALUES('$nohp','$password','$nama')";
	$save = mysqli_query($con,$query);
	if($save){
		echo 'Berhasil Menambahkan data';
	} else {
		echo 'Gagal Menambahkan Data';
	}
?>