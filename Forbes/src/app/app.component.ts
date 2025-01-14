import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ArtComponent } from './art/art.component';
import { BoatsPlanesComponent } from './boats-planes/boats-planes.component';
import { CarsBikesComponent } from './cars-bikes/cars-bikes.component';
import { DiningComponent } from './dining/dining.component';
import { ForbesLifeComponent } from './forbes-life/forbes-life.component';
import { TravelGuideComponent } from './travel-guide/travel-guide.component';
import { SpiritsComponent } from './spirits/spirits.component';
import { WatchesComponent } from './watches/watches.component';
import { VicesComponent } from './vices/vices.component';
import { TravelComponent } from './travel/travel.component';
import { StyleBeautyComponent } from './style-beauty/style-beauty.component';
import { MainComponent } from './main/main.component';



@Component({
  selector: 'app-root',
  standalone: true,
  imports:
   [
  RouterOutlet,
  ArtComponent,
  BoatsPlanesComponent,
  CarsBikesComponent,
  DiningComponent,
  ForbesLifeComponent,
  TravelGuideComponent,
  SpiritsComponent,
  WatchesComponent,
  VicesComponent,
  TravelComponent,
  StyleBeautyComponent,
  MainComponent
],
  
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'lifeStyle';
}


