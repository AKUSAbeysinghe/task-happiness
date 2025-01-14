import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarsBikesComponent } from './cars-bikes.component';

describe('CarsBikesComponent', () => {
  let component: CarsBikesComponent;
  let fixture: ComponentFixture<CarsBikesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CarsBikesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CarsBikesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
