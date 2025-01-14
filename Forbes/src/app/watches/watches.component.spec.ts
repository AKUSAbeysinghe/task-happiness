import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WatchesComponent } from './watches.component';

describe('WatchesComponent', () => {
  let component: WatchesComponent;
  let fixture: ComponentFixture<WatchesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [WatchesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
