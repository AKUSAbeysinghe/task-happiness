import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpiritsComponent } from './spirits.component';

describe('SpiritsComponent', () => {
  let component: SpiritsComponent;
  let fixture: ComponentFixture<SpiritsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SpiritsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SpiritsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
