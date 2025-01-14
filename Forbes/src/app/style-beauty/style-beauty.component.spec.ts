import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StyleBeautyComponent } from './style-beauty.component';

describe('StyleBeautyComponent', () => {
  let component: StyleBeautyComponent;
  let fixture: ComponentFixture<StyleBeautyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [StyleBeautyComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StyleBeautyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
