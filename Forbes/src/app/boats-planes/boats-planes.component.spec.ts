import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoatsPlanesComponent } from './boats-planes.component';

describe('BoatsPlanesComponent', () => {
  let component: BoatsPlanesComponent;
  let fixture: ComponentFixture<BoatsPlanesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BoatsPlanesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BoatsPlanesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
