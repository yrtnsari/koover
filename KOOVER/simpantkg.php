<?php
	
	$con = mysqli_connect("localhost","root","","db_koover");
	
	if(mysqli_connect_errno())
	{
		echo "Failed to connect to MySQL: ". mysqli_connect_error();
	}

	$nohptkg = $_GET['nohptkg'];
	$namatkg = $_GET['namatkg'];
	$pekerjaan= $_GET['pekerjaan'];
	$alamat = $_GET['alamat'];
	$harga = $_GET['harga'];
	
	$query = "INSERT INTO tukang VALUES('$nohptkg','$namatkg','$pekerjaan','$alamat', $harga)";
	$save = mysqli_query($con,$query);
	if($save){
		echo 'Berhasil Menambahkan data';
	} else {
		echo 'Gagal Menambahkan Data';
	}
?>