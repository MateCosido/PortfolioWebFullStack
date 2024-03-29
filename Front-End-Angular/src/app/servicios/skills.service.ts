import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skills } from '../model/skills';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  private apiServerUrl='https://back-end-java-springboot.herokuapp.com'

  constructor(private http:HttpClient) { }

  public obtenerSkills():Observable<Skills[]>{
    return this.http.get<Skills[]>(`${this.apiServerUrl}/skills/all`);
  }

  public addSkills(skills: Skills):Observable<Skills>{
    return this.http.post<Skills>(`${this.apiServerUrl}/skills/add`,skills);
  }
  public editarSkills(skills: Skills):Observable<Skills>{
    return this.http.put<Skills>(`${this.apiServerUrl}/skills/update`,skills);
  }
  public borrarSkills(SkillsId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/skills/delete/${SkillsId}`);
  }
}
