package com.example.spinnercheck

object DataManager {
    val courses = HashMap< String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
//        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents")
        courses.set(course.courseId, course)
    }
}