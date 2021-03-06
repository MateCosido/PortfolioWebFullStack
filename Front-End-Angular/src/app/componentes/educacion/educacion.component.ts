import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Educacion } from 'src/app/model/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})

export class EducacionComponent implements OnInit {

  public educaciones: Educacion[]=[];
  public editarEducacion: Educacion | undefined;
  public deleteEducacion: Educacion | undefined;


  constructor(public educacionService:EducacionService) { }

  ngOnInit(): void {
    this.obtenerEducacion();
  }

  public obtenerEducacion():void{
    this.educacionService.obtenerEducacion().subscribe({
      next:(Response: Educacion[]) => {
        this.educaciones=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
      
    })
    }

    public onOpenModal(mode:String, educacion?: Educacion):void{
    const container=document.getElementById('main-container');
    const button=document.createElement('button');
    button.style.display='none';
    button.setAttribute('data-toggle', 'modal');
    if(mode==='add'){
      button.setAttribute('data-target','#addEducacionModal');
    }else if(mode==='delete'){
      this.deleteEducacion=educacion;
      button.setAttribute('data-target','#deleteEducacionModal');
    }else if(mode==='edit'){
      this.editarEducacion=educacion;
      button.setAttribute('data-target', '#editEducacionModal');
    }
    container?.appendChild(button);
    button.click();
    console.log("Estoy llamando a la función")
    }

    public onAddEducacion(addForm: NgForm){
      document.getElementById('add-educacion-form')?.click();
      this.educacionService.addEducacion(addForm.value).subscribe({
        next: (response:Educacion) =>{
          console.log(response);
          this.obtenerEducacion();
          addForm.reset();
        },
        error:(error:HttpErrorResponse)=>{
          alert(error.message);
          addForm.reset();
        }
      })
    }


    public onUpdateEducacion(educacion: Educacion){
      this.editarEducacion=educacion;
      document.getElementById('add-educacion-form')?.click();
      this.educacionService.updateEducacion(educacion).subscribe({
        next: (response:Educacion) =>{
          console.log(response);
          this.obtenerEducacion();
        },
        error:(error:HttpErrorResponse)=>{
          alert(error.message);
        }
      })
    }
    
    public onDeleteEducacion(idEdu: number):void{
      this.educacionService.deleteEducacion(idEdu).subscribe({
        next: (response:void) =>{
          console.log(response);
          this.obtenerEducacion();
        },
        error:(error:HttpErrorResponse)=>{
          alert(error.message);
        }
      })
    }
}
