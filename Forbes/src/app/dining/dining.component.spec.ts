import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DiningComponent } from './dining.component';

describe('DiningComponent', () => {
  let component: DiningComponent;
  let fixture: ComponentFixture<DiningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DiningComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DiningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
