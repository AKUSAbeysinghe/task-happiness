import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VicesComponent } from './vices.component';

describe('VicesComponent', () => {
  let component: VicesComponent;
  let fixture: ComponentFixture<VicesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VicesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
