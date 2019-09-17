import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestedMentorListItemComponent } from './requested-mentor-list-item.component';

describe('RequestedMentorListItemComponent', () => {
  let component: RequestedMentorListItemComponent;
  let fixture: ComponentFixture<RequestedMentorListItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestedMentorListItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestedMentorListItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
