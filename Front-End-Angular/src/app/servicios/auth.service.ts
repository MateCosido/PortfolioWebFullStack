import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtDto } from '../model/jwtDto';
import { LoginUsuario } from '../model/loginUsuario';
import { NuevoUsuario } from '../model/nuevoUsuario';


@Injectable({
  providedIn: 'root'
})
export class AuthService {
/*------- URL API------------------*/
  private apiServerUrl= 'http://localhost:8080/auth/'


  constructor(private httpClient: HttpClient) { }

  public nuevo(nuevoUsuario: NuevoUsuario): Observable<any> {
    return this.httpClient.post<any>(this.apiServerUrl + 'nuevo', nuevoUsuario);
  }

  public login(loginUsuario: LoginUsuario): Observable<JwtDto> {
    return this.httpClient.post<JwtDto>(this.apiServerUrl + 'login', loginUsuario);
  }
}