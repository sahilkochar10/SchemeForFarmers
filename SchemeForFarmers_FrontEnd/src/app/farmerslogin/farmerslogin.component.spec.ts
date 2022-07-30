import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FarmersloginComponent } from './farmerslogin.component';

describe('FarmersloginComponent', () => {
  let component: FarmersloginComponent;
  let fixture: ComponentFixture<FarmersloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FarmersloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FarmersloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
