# Parameta

Este proyecto es un backend para la prueba técnica de Parameta.

## Características

- Petición tipo GET que recibe información del empleado.
- Servicio que recibe y persiste los datos del empleado y calcula su edad y tiempo de vinculación.

## Requisitos previos

- Java 17 o superior
- Maven
- MySQL (o base de datos de preferencia)

## Instalación

1. Clona el repositorio:
   ```
   git clone https://github.com/Tulio-Rangel/Parameta
   ```

2. Navega al directorio del proyecto:
   ```
   cd Parameta
   ```

3. Configura la base de datos:
    - Crea una base de datos MySQL
    - Actualiza los detalles de conexión en `src/main/resources/application.properties`

4. Construye el proyecto:
   ```
   mvn clean install
   ```

5. Ejecuta la aplicación:
   ```
   mvn spring-boot:run
   ```

La aplicación ahora debería estar corriendo en `http://localhost:8080`.


### API Endpoints

- GET `/empleado`: Recibe los parámetros nombres, apellidos, tipoDocumento, numeroDocumento, fechaNacimiento, fechaVinculacion, cargo y salario y devuelve un JSON con los mismos datos, adicionando la edad del empleado y el tiempo que lleva vinvulado.

### Ejemplo de uso

Colección de Postman en:

```
https://github.com/Tulio-Rangel/Parameta/blob/main/Parameta.postman_collection.json
```
## Diagrama de Clases
[![](https://mermaid.ink/img/pako:eNrlVc1u2zAMfhVBpxV1XsAoAhTNbts6NEVPvrAS4wiTRIOSCxRB3r1yEmdyLaQBdpwvpsiPf59EaScVaZS1VBZCWBloGVzjRfoOGvHddRZB0wP5yGQtstgd7cO3GM1r5DejUOB0_Rd522Icwd88uVfGUAno0FqjKYnRdLQi1Tv0kSrhk8C5YoNqC79AGWcyxYvxqrdJS74SCrhNhgAW2NDNMfm-1M3q-TFv43Yd2fhWnOqaG851zk2Tugshp31kgBVE_NxV0Zz1OI9_6Dl3o_7V4sjBHI8adKmJtHE0S1TkbrL_Pyh5G_3fUDllhJn4CUNHPmDpPDkMAVq8QOYTdhRMJH7P_e_ujI_IG1C4XF7wHqcu35H14_3vBztQIAJBdxQLE5tlxpkqa6VjUhiAz8ObzVBpxLL8u39IG9DryymPQuF-WiyWM4Zq0YfxNH7hMtwN18Anm19yGHNfE7yE_RKYUX1tzIz-3CWLdAW6YP5UtwOfzn2Cy0qmoXVgdHpjDuehkXGLDhtZJ1ED_2lk4_cJB32k9btXso7cYyWZ-nYr6w3YkFZ9p9MUnx6osxb1kP7n6QkbfvsPECg5Xw?type=png)](https://mermaid.live/edit#pako:eNrlVc1u2zAMfhVBpxV1XsAoAhTNbts6NEVPvrAS4wiTRIOSCxRB3r1yEmdyLaQBdpwvpsiPf59EaScVaZS1VBZCWBloGVzjRfoOGvHddRZB0wP5yGQtstgd7cO3GM1r5DejUOB0_Rd522Icwd88uVfGUAno0FqjKYnRdLQi1Tv0kSrhk8C5YoNqC79AGWcyxYvxqrdJS74SCrhNhgAW2NDNMfm-1M3q-TFv43Yd2fhWnOqaG851zk2Tugshp31kgBVE_NxV0Zz1OI9_6Dl3o_7V4sjBHI8adKmJtHE0S1TkbrL_Pyh5G_3fUDllhJn4CUNHPmDpPDkMAVq8QOYTdhRMJH7P_e_ujI_IG1C4XF7wHqcu35H14_3vBztQIAJBdxQLE5tlxpkqa6VjUhiAz8ObzVBpxLL8u39IG9DryymPQuF-WiyWM4Zq0YfxNH7hMtwN18Anm19yGHNfE7yE_RKYUX1tzIz-3CWLdAW6YP5UtwOfzn2Cy0qmoXVgdHpjDuehkXGLDhtZJ1ED_2lk4_cJB32k9btXso7cYyWZ-nYr6w3YkFZ9p9MUnx6osxb1kP7n6QkbfvsPECg5Xw)