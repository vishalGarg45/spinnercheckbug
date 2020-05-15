package com.example.spinnercheck

data class CourseInfo (val courseId: String) {
//    override fun toString(): String {
//        return title
//    }
}

data class NoteInfo (var course: CourseInfo, var title: String, var text: String)