import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  private apiServerUrl='https://back-end-java-springboot.herokuapp.com'

  constructor(private http: HttpClient) { }
//Observable hace todas las peticiones asincronas
  public verPersona(): Observable<Persona[]>{
    return this.http.get<Persona[]>(`${this.apiServerUrl}/personas/ver`);
  }

  public actualizar(persona: Persona):Observable<Persona>{
    return this.http.put<Persona>(`${this.apiServerUrl}/personas/actualizar`, persona);
  }

  public deletePersona(id: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/delete/${id}`);
  }
  
}
