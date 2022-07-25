import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AcercaDe } from 'src/app/model/acercaDe';
import { AcercaDeService } from 'src/app/servicios/acerca-de.service';
import { __values } from 'tslib';


@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {

  public acercaDe:AcercaDe[]=[]
  formVisivility:boolean = false
  public editAcercaDe:AcercaDe | undefined

  constructor(private acercaDeService:AcercaDeService) { }

  ngOnInit(): void {
    this.obtenerAcercaDe();
  }

  public obtenerAcercaDe():void{
    this.acercaDeService.obtenerAcercaDe().subscribe({
      next:(Response: AcercaDe[]) =>{
        this.acercaDe=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message)
      }
    });
  }

  onSubmit(acercaDe:AcercaDe):void {
    this.formVisivility=false;
    this.editAcercaDe=acercaDe;
    document.getElementById('texto')?.click();
    this.acercaDeService.editarAcercaDe(acercaDe).subscribe({
      next: (response:AcercaDe) => {
        console.log(response);
        this.obtenerAcercaDe()
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  editarTexto(){
    this.formVisivility=true;
  }

}
