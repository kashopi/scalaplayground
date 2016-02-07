# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "debian780"
  config.vm.network "forwarded_port", guest: 8080, host: 8080
  config.vm.provider "libvirt" do |vb|
    vb.memory = 512
  end
  config.vm.provision "shell", inline: <<-SHELL
    sudo apt-get update
    sudo apt-get upgrade -y
    sudo apt-get install -y vim tmux elinks scala
  SHELL
end
