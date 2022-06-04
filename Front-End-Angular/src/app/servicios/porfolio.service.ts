import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PorfolioService {
  /* ACA TAMBIEN VA LA URL DE NUESTRA API --------------------------------------------------------*/
  url:string="http://localhost:8080";
  constructor(private http:HttpClient) { }

  ObtenerDatos():Observable<any>
  {
    return this.http.get<any>(this.url+"persona");
    /* 37:07  y 37:42 ------------------------------------------------------------------------------*/
    console.log("El Servicio Porfolio está funcionando");
  }

}
