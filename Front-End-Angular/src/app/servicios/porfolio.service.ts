import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona';



@Injectable({
  providedIn: 'root'
})
export class PorfolioService {
/*ACA VA URL API*/
  private apiServerUrl= 'https://back-end-java-springboot.herokuapp.com'

  constructor(private http:HttpClient) { }

  public verPersona():Observable<Persona[]>{
    return this.http.get<Persona[]>(`${this.apiServerUrl}/personas/ver`);
  }
}