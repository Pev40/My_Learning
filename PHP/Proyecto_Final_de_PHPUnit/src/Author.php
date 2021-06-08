<?php

namespace App;
class Author extends Post{

    public $post = [];

    public function __construct($name){
        $this->name = $name;
    }
    
    public function addPost(Post $post){
        array_unshift($this->post, $post);
    }
    
        
    
}