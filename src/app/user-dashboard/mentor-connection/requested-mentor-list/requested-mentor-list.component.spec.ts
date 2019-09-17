import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestedMentorListComponent } from './requested-mentor-list.component';

describe('RequestedMentorListComponent', () => {
  let component: RequestedMentorListComponent;
  let fixture: ComponentFixture<RequestedMentorListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestedMentorListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestedMentorListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
