import { Component } from '@angular/core';

@Component({
  selector: 'app-art',
  standalone: true,
  imports: [],
  templateUrl: './art.component.html',
  styleUrl: './art.component.css'
})
export class ArtComponent {

    bodyImageURL : string = "https://imageio.forbes.com/specials-images/imageserve/665a2ddbdf5cb242b4d1b356/0x0.jpg?format=jpg";
    AIimage: string = "";
    NinaBambysheva : string = "";
    smallBussiness : string = " ";
  
}
