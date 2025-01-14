import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForbesLifeComponent } from './forbes-life.component';

describe('ForbesLifeComponent', () => {
  let component: ForbesLifeComponent;
  let fixture: ComponentFixture<ForbesLifeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ForbesLifeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ForbesLifeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
