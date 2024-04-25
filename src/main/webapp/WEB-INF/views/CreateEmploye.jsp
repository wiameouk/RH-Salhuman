<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Creation</title>
</head>
<body>
<header>
    <h1>Employe Creation</h1>
</header>
<main>
    <form action="saveEmploye" method="post">
        <div>
            <label for="firstName">First Name : </label>
            <input type="text" id="firstName" name="fNom">
        </div>
        <div>
            <label for="lastName">Last Name : </label>
            <input type="text" id="lastName" name="Prenom">
        </div>
        <div>
            <label for="departement">Departement : </label>
            <input type="text" id="departement" name="Departement">
        </div>
        <div>
            <label for="poste">Poste: </label>
            <input type="text" id="poste" name="Poste">
        </div>
        <div>
            <label for="dateembauche">Date Embauche: </label>
            <input type="Date" id="dateembauche" name=" DateEmbauche">
        </div>


        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="employeList">Employe List</a>
</footer>
</body>
</html>
