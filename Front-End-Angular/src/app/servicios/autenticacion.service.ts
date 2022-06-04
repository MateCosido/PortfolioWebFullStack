import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
/* BehaviorSubject un observable que expone errores como next error y complete
y tiene una nocion de estado, x lo que al momento de suscribirnos vamos a poder 
acceder al ultimo valor disponible */

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {
  /* URL DE LA API ACA ABAJO -------------------27:36---------------------------------------------- */
  url="http://localhost:8080";
  currentUserSubject: BehaviorSubject<any>;
  constructor(private http: HttpClient) { 
    console.log("El servicio de autenticacion está funcionando");
    this.currentUserSubject = new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser')|| '{}'));
  }

  iniciarSesion(credenciales:any):Observable<any>
  {
     return this.http.post(this.url, credenciales).pipe(map(data=>{
      sessionStorage.setItem('currentUser', JSON.stringify(data));
      this.currentUserSubject.next(data);
      return data;
     }))
  }

  get UsuarioAutenticado()
  {
    return this.currentUserSubject.value;
  }
}
