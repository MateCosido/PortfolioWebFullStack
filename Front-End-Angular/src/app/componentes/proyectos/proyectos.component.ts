import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Proyectos } from 'src/app/model/proyectos';
import { ProyectosService } from 'src/app/servicios/proyectos.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  public proyectos:Proyectos[]=[];
  public editarProyectos:Proyectos | undefined;
  public deleteProyectos:Proyectos | undefined;
  
  constructor(private proyectosService:ProyectosService) { }

  ngOnInit(): void {
    this.obtenerProyectos();
  }

  public obtenerProyectos():void{
    this.proyectosService.obtenerProyectos().subscribe({
      next:(Response:Proyectos[]) =>{
      this.proyectos=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message) 
      }
    });
  }
  public onOpenModal(mode:String, proyectos?: Proyectos):void{
    const container=document.getElementById('main-container');
    const button=document.createElement('button');
    button.style.display='none';
    button.setAttribute('data-toggle','modal');
    if(mode==='add'){
      button.setAttribute('data-target','#addProyectosModal');
    }else if(mode==='delete'){
      this.deleteProyectos=proyectos;
      button.setAttribute('data-target','#deleteProyectosModal');
    }else if(mode==='edit'){
      this.editarProyectos=proyectos;
      button.setAttribute('data-target','#editProyectosModal');
    }
    container?.appendChild(button); 
    button.click();
    console.log("llama a la funcion");
  }

  public onAddProyectos(addForm: NgForm):void{
    document.getElementById('add-proyectos-form')?.click();
    this.proyectosService.addProyectos(addForm.value).subscribe({
      next: (response:Proyectos) =>{
        console.log(response);
        this.obtenerProyectos();
        addForm.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message)
        addForm.reset();
      }
    })
  }

  public onUpdateProyectos(proyectos: Proyectos){
    this.editarProyectos=proyectos;
    document.getElementById('add-proyectos-form')?.click();
    this.proyectosService.editarProyectos(proyectos).subscribe({
      next: (response:Proyectos) =>{
        console.log(response);
        this.obtenerProyectos();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message)
      }
    })
  }

  public onDeleteProyectos(id:number):void{
    this.proyectosService.borrarProyectos(id).subscribe({
      next: (response:void) =>{
        console.log(response);
        this.obtenerProyectos();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message)
      }
    })
  }

}
