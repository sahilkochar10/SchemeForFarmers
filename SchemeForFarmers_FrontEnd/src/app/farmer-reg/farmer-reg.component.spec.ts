import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FarmerRegComponent } from './farmer-reg.component';

describe('FarmerRegComponent', () => {
  let component: FarmerRegComponent;
  let fixture: ComponentFixture<FarmerRegComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FarmerRegComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FarmerRegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
