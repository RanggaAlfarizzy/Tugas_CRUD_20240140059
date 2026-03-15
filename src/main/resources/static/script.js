const API = "http://localhost:8080/ktp"

$(document).ready(function(){
loadData()
})

function loadData(){

$.get(API,function(data){

let html=""

data.forEach(d => {

html += `
<tr>
<td>${d.id}</td>
<td>${d.nomorKtp}</td>
<td>${d.namaLengkap}</td>
<td>${d.alamat}</td>
<td>${d.tanggalLahir}</td>
<td>${d.jenisKelamin}</td>
<td>
<button onclick="hapus(${d.id})">Delete</button>
</td>
</tr>
`

})

$("#dataKtp").html(html)

})

}

function tambahData(){

let data = {

nomorKtp: $("#nomorKtp").val(),
namaLengkap: $("#namaLengkap").val(),
alamat: $("#alamat").val(),
tanggalLahir: $("#tanggalLahir").val(),
jenisKelamin: $("#jenisKelamin").val()

}

$.ajax({

url: API,
method:"POST",
contentType:"application/json",
data:JSON.stringify(data),

success:function(){

alert("Data berhasil ditambahkan")

loadData()

}

})

}

function hapus(id){

$.ajax({

url: API+"/"+id,
method:"DELETE",

success:function(){

alert("Data berhasil dihapus")

loadData()

}

})

}