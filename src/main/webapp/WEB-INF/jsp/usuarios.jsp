<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/style.css">
    <title>Tienda Web/usuarios</title>
</head>

<body>
    <nav>
        <ul>
            <il> <a href="./ventas">Ventas</a></il>
            <il> <a href="./usuarios">Usuarios</a></il>
            <il> <a href="./clientes">Clientes</a></il>
            <il> <a href="./proveedores">Proveedores</a></il>
            <il> <a href="./productos">Productos</a></il>
        </ul>
    </nav>
    <div class="container">
        <h1>Administrador de Usuarios</h1>
        <div class="flex">
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                <img src="https://img.icons8.com/ios-filled/30/ffffff/add-user-male.png" />
                <span>Nuevo</span>
            </button>
        </div>

        <div class="mt-5">
            <table class="table table-striped table-responsive">
                <thead>
                    <tr>
                        <th>Documento</th>
                        <th>Correo ELectronico</th>
                        <th>Usuarios</th>
                        <th>Contraseña</th>
                        <th>Usuario</th>
                        <th>Editar</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>
                            <div class="flex">
                                <button class="btn btn-danger">
                                    <img src="https://img.icons8.com/ios-filled/30/ffffff/delete-user-male.png"/>
                                </button>
                                <button class="btn btn-secondary">
                                    <img src="https://img.icons8.com/ios-glyphs/30/ffffff/edit-user-male.png"/>
                                </button>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
        aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title" id="staticBackdropLabel">Nuevo Usuario</h3>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="./usuarios/guardar" method="get">
                        <div>
                            <label class="form-label" for="">Documento de indentidad:</label>
                            <input type="text" placeholder="Documento de indentidad" class="form-control"
                                name="cedula_usuario">
                        </div>
                        <div>
                            <label class="form-label" for="">Nombre</label>
                            <input type="text" placeholder="Nombres y Apellidos" class="form-control"
                                name="nombre_usuario">
                        </div>
                        <div>
                            <label class="form-label" for="">Correo</label>
                            <input type="email" placeholder="email" class="form-control" name="email_usuario">
                        </div>
                        <div class="hide">
                            <label class="form-label" for="">Contrase&ntildea</label>
                            <input type="text" value="123456" class="form-control" name="password">
                        </div>
                        <div class="hide">
                            <label class="form-label" for="">Usuario</label>
                            <input type="text" value="usuarioprueba" class="form-control" name="password">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Cancelar</button>
                            <button type="submit" class="btn btn-secondary">Enviar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ"
        crossorigin="anonymous"></script>
</body>

</html>