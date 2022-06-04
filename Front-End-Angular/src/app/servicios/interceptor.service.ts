import { Injectable } from '@angular/core';
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AutenticacionService } from './autenticacion.service';

@Injectable({
  providedIn: 'root'
})
export class InterceptorService implements HttpInterceptor {

  constructor(private autenticacionServicio: AutenticacionService) { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
/* Intercepta el Request le agrega Token y deja que siga camino */
   
   var currentUser=this.autenticacionServicio.UsuarioAutenticado;
   if(currentUser && currentUser.accessToken)
   {
     req=req.clone({
       setHeaders:{
       Authorization: 'Bearer ${currentUser.accesToken}'
       }
     })
   }
   console.log("Interceptor esta funcionando " + JSON.stringify(currentUser));
   return next.handle(req);

  }
}
