import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SellCropComponent } from './sell-crop.component';

describe('SellCropComponent', () => {
  let component: SellCropComponent;
  let fixture: ComponentFixture<SellCropComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SellCropComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SellCropComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
